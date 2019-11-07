package team.huoguo.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import team.huoguo.forum.bean.Forum;

@Component
public interface ForumRepository extends JpaRepository<Forum, String> {

}

