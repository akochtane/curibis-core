package com.curibis.contentcalendar.repository;

import com.curibis.contentcalendar.model.Content;
import com.curibis.contentcalendar.model.Status;
import com.curibis.contentcalendar.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {

    private final List<Content> contentList = new ArrayList<>();

    public ContentCollectionRepository() {

    }

    public List<Content> findAll() {

        return contentList;
    }

    public Optional<Content> findById(Integer id){

        return contentList.stream().filter(c -> c.id().equals(id)).findFirst();

    }

    public void save(Content content) {
        contentList.removeIf(c -> c.id().equals(content.id()));
        contentList.add(content);
    }


    @PostConstruct
    private void init() {
        Content content = new Content(
                1,
                "Blog post",
                "This is amine's blog",
                Status.IN_PROGRESS,
                Type.ARTICLE,
                LocalDateTime.now(),
                LocalDateTime.now(),
                "https://mycontent.com/amine-blog");

        contentList.add(content);
    }

    public void updateContent(Content content, Integer id) {

    }

    public boolean existsById(Integer id) {
        return contentList.stream().filter(c -> c.id().equals(id)).count() == 1;
    }

    public void delete(Integer id) {

        contentList.removeIf(c -> c.id().equals(id));
    }
}
