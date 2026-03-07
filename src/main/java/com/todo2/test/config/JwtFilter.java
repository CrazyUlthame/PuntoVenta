package com.todo2.test.config;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Component;

import com.todo2.test.exception.TokenExpiredException;

import java.io.IOException;
import java.util.Collections;

@Component
public class JwtFilter extends GenericFilter {

    private final JwtUtil jwtUtil;

    public JwtFilter(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        String header = httpRequest.getHeader("Authorization");

        try {

            if (header != null && header.startsWith("Bearer ")) {

                String token = header.substring(7);
                String username = jwtUtil.extractUsername(token);

                UsernamePasswordAuthenticationToken auth =
                        new UsernamePasswordAuthenticationToken(
                                username,
                                null,
                                Collections.emptyList()
                        );

                SecurityContextHolder.getContext().setAuthentication(auth);
            }

            chain.doFilter(request, response);

        } catch (TokenExpiredException e) {

            httpResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            httpResponse.setContentType("application/json");
            httpResponse.getWriter().write("""
                {
                    "error": "TOKEN_EXPIRED",
                    "message": "El token ha expirado"
                }
            """);

        } catch (Exception e) {

            httpResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            httpResponse.setContentType("application/json");
            httpResponse.getWriter().write("""
                {
                    "error": "INVALID_TOKEN",
                    "message": "Token inválido"
                }
            """);
        }
    }
}