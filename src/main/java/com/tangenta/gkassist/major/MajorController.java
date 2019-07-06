package com.tangenta.gkassist.major;


import com.tangenta.gkassist.major.representation.CommentRepresentation;
import com.tangenta.gkassist.major.representation.MajorRepresentation;
import com.tangenta.gkassist.major.representation.ScoreRepresentation;
import com.tangenta.gkassist.school.model.SchoolId;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/major")
public class MajorController {
     private final MajorApplicationService service;


     public MajorController(MajorApplicationService service){
         this.service = service;
     }


    @GetMapping("/{id}/{majorid}/message")
    public MajorRepresentation majormessage(
            @PathVariable(name = "id") String schoolId,
            @PathVariable(name = "majorid") String majorid){
        return service.majorpage(schoolId,majorid);
    }


   @GetMapping("/{schoolname}/{majorname}/Score")
    public ScoreRepresentation scoremessage(
            @PathVariable(name = "schoolname") String schoolMame,
            @PathVariable(name = "majorname") String majorName){
         //id,获取名字
        return service.scoremessage(schoolMame,majorName);
    }

    @GetMapping("/{id}/{majorid}/comment")
    public CommentRepresentation commentmessage(
            @PathVariable(name = "id") String schoolId,
            @PathVariable(name = "majorid") String majorId
    ){
        return service.commentmessage(schoolId,majorId);
    }

    @RequestMapping(value = "/SaveComment")
    public void savecomment(
            @RequestParam("schoolId") String schoolId,
            @RequestParam("majorId") String majorId,
            @RequestParam("user") String user,
            @RequestParam("content") String content
    ){
          service.savecomment(schoolId,majorId,user ,content);
    }




}
