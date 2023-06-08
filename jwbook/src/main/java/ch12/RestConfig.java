package ch12;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

// JAX-RS -> javax.ws.rs.* import
// 서비스 진입점
@ApplicationPath("/api")
public class RestConfig extends Application {
	
	public Map<String, Object> getProperties() {
		Map<String, Object> properties = new HashMap<String, Object>();
		// ch12 패키지에서 REST API 를 찾는다는 설정
		// jersey.config.server.provider.packages 정확하게 작성
		properties.put("jersey.config.server.provider.packages", "ch12");
		return properties;
	}

}
