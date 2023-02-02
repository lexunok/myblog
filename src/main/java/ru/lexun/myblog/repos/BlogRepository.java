package ru.lexun.myblog.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.lexun.myblog.models.Blog;

public interface BlogRepository extends MongoRepository<Blog,Long> {
}
