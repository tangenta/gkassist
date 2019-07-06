package com.tangenta.gkassist.school;

import com.tangenta.gkassist.school.model.SchoolId;
import com.tangenta.gkassist.school.representation.SchoolBriefRepresentation;
import com.tangenta.gkassist.school.representation.SchoolRepresentation;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/school")
public class SchoolController {
    private final SchoolApplicationService service;

    public SchoolController(SchoolApplicationService service) {
        this.service = service;
    }

    @ApiOperation(value = "获得学校代码为id的学校主页信息")
    @GetMapping("/{id}/home")
    public SchoolRepresentation homepage(
            @ApiParam(value = "学校代码", required = true)
            @PathVariable(name = "id") String schoolId) {
        return service.homepage(SchoolId.of(schoolId));
    }

    @ApiOperation(value = "返回所有学校及其代码")
    @GetMapping("/all")
    public SchoolBriefRepresentation allSchools(
            @ApiParam(name = "page", value = "zero-based page index")
            @RequestParam(value = "page", required = false) int page,
            @ApiParam(name = "pageSize", value = "the size of the page to be returned")
            @RequestParam(value = "pageSize", required = false) int size) {
        return service.allSchools(page, size);
    }

    @ApiOperation(value = "搜索学校代码或名称")
    @GetMapping("/search")
    public SchoolBriefRepresentation searchSchool(
            @ApiParam(value = "查找的字符串，学校代码或名称")
            @RequestParam(name = "query") String query) {
        return service.searching(query);
    }
}
