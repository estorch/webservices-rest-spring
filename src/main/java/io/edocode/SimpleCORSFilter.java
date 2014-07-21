package main.java.io.edocode;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

/**
 * @author      Eric Storch <eric@edocode.io>
 * @version     0.1
 * @since       2014-06-03
 */
@Component
public class SimpleCORSFilter implements Filter {

  /**
   * Sets the CORS filter to handle some W3C standards
   *
   * @param       req
   * @param       res
   * @param       chain
   * @throws      IOException
   * @throws      ServletException
   */
  public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
    HttpServletResponse response = (HttpServletResponse) res;
    response.setHeader("Access-Control-Allow-Origin", "*");
    response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
    response.setHeader("Access-Control-Max-Age", "3600");
    response.setHeader("Access-Control-Allow-Headers", "Origin, x-requested-with, Content-Type, Accept");
    chain.doFilter(req, res);
  }

  /**
   * Initializer
   *
   * @param     filterConfig      Filter configuration
   */
  public void init(FilterConfig filterConfig) { }

  /**
   * Destoryer (of worlds)
   */
  public void destroy() { }
}