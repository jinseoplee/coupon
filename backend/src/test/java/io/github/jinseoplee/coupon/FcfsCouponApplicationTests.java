package io.github.jinseoplee.coupon;

import io.github.jinseoplee.coupon.config.TestcontainersConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@Import(TestcontainersConfig.class)
@SpringBootTest
class FcfsCouponApplicationTests {

	@Test
	void contextLoads() {
	}

}
