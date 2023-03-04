package com.bjpowernode;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Author jack
 * @Description
 * @Date 2023/2/28 10:54
 */
public class PasswordEncoderTest {

    @Test
    void test() {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String rawPassword = "123456";

        String p1 = passwordEncoder.encode(rawPassword);
        System.out.println(p1);
        System.out.println(passwordEncoder.matches(rawPassword,"$2a$10$DpisPuS3Vf9qsEs9h8IEFOKBW6XWfSI/rerMwirNH6kxdne/X9KEK"));
    }
}
// $2a$10$DpisPuS3Vf9qsEs9h8IEFOKBW6XWfSI/rerMwirNH6kxdne/X9KEK
// $2a$10$Lw6ejnZ2S8yuietOtbZI9.jY1Ih2D0ExBdKe3QFGD5NyPxmxt3zN6