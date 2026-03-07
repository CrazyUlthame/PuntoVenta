package com.todo2.test.config;

import org.springframework.stereotype.Component;

import com.todo2.test.exception.TokenExpiredException;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Date;

@Component
public class JwtUtil {
    private final String SECRET = "mi_clave_secreta_super_segura_para_jwt_2026";
    private final long Expiration = 1000 * 60 * 60;//

    private Key getSigningKey(){
        return Keys.hmacShaKeyFor(SECRET.getBytes());
    }
    public String generatedToken(String username){
        return Jwts.builder()
            .setSubject(username)
            .setIssuedAt(new Date())
            .setExpiration(new Date(System.currentTimeMillis()+ Expiration))
            .signWith(getSigningKey(), SignatureAlgorithm.HS256)
            .compact();
    }

    public String extractUsername(String token){
        try{
            return Jwts.parserBuilder()
                .setSigningKey(getSigningKey())
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getSubject();        
        } catch (ExpiredJwtException e) {
            throw new TokenExpiredException();
        } catch (JwtException e){
            throw new RuntimeException("INVALID_TOKEN");
        }
    }
}
