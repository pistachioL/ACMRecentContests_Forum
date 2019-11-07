package team.huoguo.forum;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import team.huoguo.forum.controller.ForumController;

import java.util.Date;

@SpringBootTest
class AcmRecentContestsForumApplicationTests {

	@Autowired
	ForumController forumController;
	@Test
	void contextLoads() {
		forumController.postForum("123","123",new Date(System.currentTimeMillis()));
	}

}
