package org.example.ch09.jwt;


import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Log4j2
@RequiredArgsConstructor
@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    private final JwtProvider jwtProvider;

    private static final String AUTH_HEADER = "Authorization";
    private static final String TOKEN_PREFIX = "Bearer";

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        // 경로 구하기
        String uri = request.getRequestURI();
        String path = uri.substring(uri.lastIndexOf("/"));

        log.info("path : " + path);

        // 토큰 추출
        Cookie[] cookies = request.getCookies();
        String token = null;

        if(cookies != null){
            for(Cookie cookie : cookies){

                if(cookie.getName().equals("AUTH-TOKEN")){
                    token = cookie.getValue(); // 쿠키에서 토큰 추출
                    break;
                }
            }
        }
        log.info("token : " + token);

        // 토큰 검증
        try {
            if(token != null) {
                jwtProvider.validateToken(token);
            }

            // 다음 필터(컨트롤러) 이동
            filterChain.doFilter(request, response);

        }catch (Exception e){
            log.error(e);

            // 토큰 검사 실패 응답처리
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, e.getMessage());
        }
    }
}












