/*
 * package com.maid.config;
 * 
 * import org.springframework.context.annotation.Configuration; import
 * org.springframework.security.crypto.factory.PasswordEncoderFactories; import
 * org.springframework.security.crypto.password.PasswordEncoder; import
 * org.springframework.security.oauth2.config.annotation.configurers.
 * ClientDetailsServiceConfigurer; import
 * org.springframework.security.oauth2.config.annotation.web.configuration.
 * AuthorizationServerConfigurerAdapter; import
 * org.springframework.security.oauth2.config.annotation.web.configuration.
 * EnableAuthorizationServer; import
 * org.springframework.security.oauth2.config.annotation.web.configurers.
 * AuthorizationServerSecurityConfigurer;
 * 
 * @Configuration
 * 
 * @EnableAuthorizationServer public class OAuth2AuthorizationServer extends
 * AuthorizationServerConfigurerAdapter {
 * 
 * @Override public void configure(AuthorizationServerSecurityConfigurer
 * security) throws Exception {
 * 
 * security.tokenKeyAccess("permitAll()").checkTokenAccess("isAuthenticated()")
 * .allowFormAuthenticationForClients(); }
 * 
 * @Override public void configure(ClientDetailsServiceConfigurer clients)
 * throws Exception { PasswordEncoder encoder =
 * PasswordEncoderFactories.createDelegatingPasswordEncoder();
 * clients.inMemory().withClient("clientapp").secret(encoder.encode("123456"))
 * .authorizedGrantTypes("password", "authorization_code",
 * "refresh_token").authorities("USER","ADMIN")
 * .scopes("read_profile_info").resourceIds("oauth2-resource")
 * .redirectUris("http://localhost:8091/society/societies").
 * accessTokenValiditySeconds(120) .refreshTokenValiditySeconds(240000); } }
 */