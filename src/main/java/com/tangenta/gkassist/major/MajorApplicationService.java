package com.tangenta.gkassist.major;


import com.tangenta.gkassist.common.ddd.ApplicationService;
import com.tangenta.gkassist.major.model.Comment;
import com.tangenta.gkassist.major.model.Majorinfo;
import com.tangenta.gkassist.major.model.Scoreinfo;
import com.tangenta.gkassist.major.repository.CommentRepository;
import com.tangenta.gkassist.major.repository.MajorInfoRepository;
import com.tangenta.gkassist.major.repository.ScoreInfoRepository;
import com.tangenta.gkassist.major.representation.CommentRepresentation;
import com.tangenta.gkassist.major.representation.MajorRepresentation;
import com.tangenta.gkassist.major.representation.MajorRepresentationService;
import com.tangenta.gkassist.major.representation.ScoreRepresentation;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

@Service

public class MajorApplicationService implements ApplicationService {
    private final MajorInfoRepository majorInfoRepo;
    private final ScoreInfoRepository  scoreInfoRepo;
    private final CommentRepository commentRepo;

     MajorApplicationService(MajorInfoRepository majorInfoRepo, ScoreInfoRepository scoreInfoRepo, CommentRepository commentRepo) {
        this.majorInfoRepo = majorInfoRepo;
        this.scoreInfoRepo = scoreInfoRepo;
        this.commentRepo = commentRepo;
    }



    public MajorRepresentation majorpage(String schoolId,String majorid){

        Predicate<Majorinfo> match=  majorinfo -> majorinfo.getId().contains(majorid);
        Predicate<Majorinfo> match2=  majorinfo -> majorinfo.getSchoolId().contains(schoolId);

        Majorinfo majorinfo=new Majorinfo();
        majorInfoRepo.findAll().forEach(majorinfo1 ->{
            if (match.test(majorinfo1)&&match2.test(majorinfo1)) {
                majorinfo.setId(majorinfo1.getId());
                majorinfo.setSchoolId(majorinfo1.getSchoolId());
                majorinfo.setName(majorinfo1.getName());
                majorinfo.setCode(majorinfo1.getCode());
                majorinfo.setIfBK(majorinfo1.getIfBK());
            }
        });


        /*Majorinfo majorinfo=majorInfoRepo.findById(schoolId.getSchoolId())
                .orElseThrow(() -> new SchoolNonExistException(schoolId));*/


        return MajorRepresentationService.toRepresentation(majorinfo);
    }

    public ScoreRepresentation scoremessage(String schoolName,String majorName){

        Scoreinfo scoreinfo=new Scoreinfo();

        Predicate<Scoreinfo> match=  scoreinfo1 -> scoreinfo1.getName().contains(majorName);
        Predicate<Scoreinfo> match2=  scoreinfo1 -> scoreinfo1.getSchool_name().contains(schoolName);

        scoreInfoRepo.findAll().forEach(scoreinfo1 ->{
            if(match.test(scoreinfo1)&&match2.test(scoreinfo1))
            {
                scoreinfo.setName(scoreinfo1.getName());
                scoreinfo.setSchool_name(scoreinfo1.getSchool_name());
                scoreinfo.setLevel1(scoreinfo1.getLevel1());
                scoreinfo.setLevel2(scoreinfo1.getLevel2());
                scoreinfo.setLevel3(scoreinfo1.getLevel3());
                scoreinfo.setLocal_batch(scoreinfo1.getLocal_batch());
                scoreinfo.setProvince(scoreinfo1.getProvince());
                scoreinfo.setType(scoreinfo1.getType());
                scoreinfo.setYear(scoreinfo1.getYear());
                scoreinfo.setMax(scoreinfo1.getMax());
                scoreinfo.setMin(scoreinfo1.getMin());
                scoreinfo.setAvg(scoreinfo1.getAvg());
            }
        });

        return new ScoreRepresentation(scoreinfo.getName(),scoreinfo.getSchool_name(),scoreinfo.getLevel1(),
                scoreinfo.getLevel2(),scoreinfo.getLevel3(),scoreinfo.getLocal_batch(),scoreinfo.getProvince(),
                scoreinfo.getType(),scoreinfo.getYear(),scoreinfo.getMax(),scoreinfo.getMin(),scoreinfo.getAvg());
    }

    public CommentRepresentation commentmessage(String schoolId,String majorId){

        Comment comment=new Comment();
        Predicate<Comment> match=  scoreinfo1 -> scoreinfo1.getSchoolId().contains(schoolId);
        Predicate<Comment> match2=  scoreinfo1 -> scoreinfo1.getMajorId().contains(majorId);

        List<String> users = new LinkedList<>();
        List<String> contents = new LinkedList<>();
        commentRepo.findAll().forEach(info -> {
            if(match.test(info)&&match2.test(info)){
                users.add(info.getUser());
                contents.add(info.getContent());

            }
        });

        return new CommentRepresentation(users.size(),users,contents);
    }

   public void savecomment(String schoolId,String majorId,String user,String content){
       Comment comment=new Comment();
       comment.setSchoolId(schoolId);
       comment.setMajorId(majorId);
       comment.setUser(user);
       comment.setContent(content);

       commentRepo.save(comment);

    }



}
