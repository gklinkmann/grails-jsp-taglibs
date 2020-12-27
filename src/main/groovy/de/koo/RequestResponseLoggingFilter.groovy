package de.koo

import javax.servlet.Filter
import javax.servlet.FilterChain
import javax.servlet.FilterConfig
import javax.servlet.ServletException
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

import org.slf4j.Logger
import org.slf4j.LoggerFactory


class RequestResponseLoggingFilter implements Filter {
	Logger log = LoggerFactory.getLogger("de.koo.RequestResponseLoggingFilter")

	@Override
	public void init(FilterConfig config) throws ServletException {
		log.info("filter initialized.")
	}

	@Override
	public void doFilter(
	  ServletRequest request,
	  ServletResponse response,
	  FilterChain chain) throws IOException, ServletException {
	  	  
		HttpServletRequest req = (HttpServletRequest) request
		HttpServletResponse res = (HttpServletResponse) response
		log.info("Logging Request {} : {}", req.getMethod(), req.getRequestURI())
		chain.doFilter(request, response)
		log.info("Logging Response : {} {}", res.getStatus(), res.getContentType())
	}
	
	@Override
	public void destroy() {

	}
}
