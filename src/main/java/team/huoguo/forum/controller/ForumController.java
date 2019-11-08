package team.huoguo.forum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team.huoguo.forum.bean.Forum;
import team.huoguo.forum.repository.ForumRepository;

import java.util.List;

@RestController
@ResponseBody

 public class ForumController {
    @Autowired
    ForumRepository forumRepository;  //注入实例

//    @PostMapping("/postComment")
@RequestMapping(value = "/postArticle", method = RequestMethod.POST)
    public Forum postForum(@RequestBody Forum forum){   //发送评论内容
            return forumRepository.save(forum);

    }

    @GetMapping(value = "getTitle")
    public List<Forum> getTitle(){   //获取评论标题
        return forumRepository.findAll();
    }


}
