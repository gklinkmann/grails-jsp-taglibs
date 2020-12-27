import org.displaytag.filter.ResponseOverrideFilter
import org.springframework.boot.web.servlet.FilterRegistrationBean
import org.springframework.core.Ordered

// Place your Spring DSL code here
beans = {
//	loggingFilter(FilterRegistrationBean) {
//		filter = bean(RequestResponseLoggingFilter)
//		urlPatterns = ['/*']
//		order = Ordered.HIGHEST_PRECEDENCE
//	}
	responseOverrideFilter(FilterRegistrationBean) {
		filter = bean(ResponseOverrideFilter)
		urlPatterns = ['/author/index']
		order = Ordered.HIGHEST_PRECEDENCE
	}
}
