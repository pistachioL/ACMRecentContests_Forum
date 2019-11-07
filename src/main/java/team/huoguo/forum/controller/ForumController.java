package team.huoguo.forum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team.huoguo.forum.bean.Forum;
import team.huoguo.forum.repository.ForumRepository;

import java.util.Date;

@RestController
@ResponseBody
 public class ForumController {
    @Autowired
    ForumRepository forumRepository;  //注入实例

    @PostMapping("/post")
    public Object postForum(@RequestParam(value="post_title ",required = false,defaultValue = "南京网络赛")String title,
                            @RequestParam(value="post_content ",required = false,defaultValue = "网路赛万千,你们有没有觉得这次的网络赛难点很多,而且在字符串上有坑")String content,
                            @RequestParam(value="post_date ",required = false,defaultValue = "2019-10-24")Date date){

                    Forum forum = new Forum(title,content,date);
                    return forumRepository.save(forum);


    }
}
