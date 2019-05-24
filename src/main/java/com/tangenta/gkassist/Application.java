package com.tangenta.gkassist;

import com.tangenta.gkassist.school.model.*;
import com.tangenta.gkassist.school.repository.AdmissionGuideRepository;
import com.tangenta.gkassist.school.repository.CampusSceneryRepository;
import com.tangenta.gkassist.school.repository.SchoolBadgeRepository;
import com.tangenta.gkassist.school.repository.SchoolInfoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.TimeZone;

import static java.time.ZoneId.of;
import static java.util.TimeZone.getTimeZone;

@SpringBootApplication
public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @PostConstruct
    void started() {
        TimeZone.setDefault(getTimeZone(of("Asia/Shanghai")));
    }

    @Bean
    public CommandLineRunner demo(AdmissionGuideRepository admRepo,
                                  CampusSceneryRepository sceneryRepo,
                                  SchoolBadgeRepository badgeRepo,
                                  SchoolInfoRepository infoRepo) {
        return args -> {
            infoRepo.save(new SchoolInfo("1234", "华南师范大学", "广东省", "广州市", "中国", "中山大道55号", "直属", true, false, true, true, true, true, true, "学校类型", "学院类型", Collections.emptyList()));
            infoRepo.save(new SchoolInfo("4321", "华南理工大学", "广东省", "广州市", "中国", "中山大道55号", "直属", true, true, true, true, true, true, true, "学校类型", "学院类型", Collections.emptyList()));

            admRepo.save(new AdmissionGuide(SchoolId.of("1234"), "example.com", "招生章程1"));
            admRepo.save(new AdmissionGuide(SchoolId.of("1234"), "example.com", "招生章程2"));
            admRepo.save(new AdmissionGuide(SchoolId.of("4321"), "example.com", "招生章程1"));
            admRepo.save(new AdmissionGuide(SchoolId.of("4321"), "example.com", "招生章程2"));
            admRepo.save(new AdmissionGuide(SchoolId.of("4321"), "example.com", "招生章程3"));

            sceneryRepo.save(new CampusScenery(SchoolId.of("1234"), "校园风光1", "link1"));
            sceneryRepo.save(new CampusScenery(SchoolId.of("1234"), "校园风光2", "link2"));
            sceneryRepo.save(new CampusScenery(SchoolId.of("4321"), "校园风光1", "link1"));

            badgeRepo.save(new SchoolBadge("1234", "badge link1"));
            badgeRepo.save(new SchoolBadge("4321", "badge link2"));
        };
    }
}
