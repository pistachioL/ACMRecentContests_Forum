package team.huoguo.forum.bean;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;


@Data
@Entity
@Table(name = "post_forum")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class Forum {
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    private String id;
    @Column
    private String title;
    @Column
    private String content;
    @Column
    private Date date;

    public Forum(){

    }

    public Forum(String title,String content,Date date){

        this.title = title;
        this.content = content;
        this.date = date;
    }


}
