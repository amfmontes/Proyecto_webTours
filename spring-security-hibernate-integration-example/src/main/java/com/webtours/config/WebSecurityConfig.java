package com.webtours.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import java.lang.Exception;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

//  @Autowired
//  private UserDetailsService userDetailsService;
  
  @Bean
  public BCryptPasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  };
  
  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
   // auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests().antMatchers("/in")
    .access("hasAnyRole('ADMIN','USER')");
    
 // Config for Login Form (HABRA QUE RETOCARLO MAS TARDE)
    http.authorizeRequests().and().formLogin()//
            // Submit URL of login page.
            .loginProcessingUrl("/loginAction") // Submit URL
            .loginPage("/login")//
            .defaultSuccessUrl("/")//
            .failureUrl("/login?error=true")//
            .usernameParameter("username")//
            .passwordParameter("password")
            // Config for Logout Page
            // (Go to home page).
            .and().logout().logoutUrl("/logout").logoutSuccessUrl("/");
    
   
  }
  
//  protected void configure(HttpSecurity http) throws Exception {
//	    http.authorizeRequests().anyRequest().hasAnyRole("ADMIN", "USER")
//	    .and()
//	    .authorizeRequests().antMatchers("/login**").permitAll()
//	    .and()
//	    .formLogin().loginPage("/login").loginProcessingUrl("/loginAction").permitAll()
//	    .and()
//	    .logout().logoutSuccessUrl("/login").permitAll()
//	    .and()
//	    .csrf().disable();
//	  }
  

}
