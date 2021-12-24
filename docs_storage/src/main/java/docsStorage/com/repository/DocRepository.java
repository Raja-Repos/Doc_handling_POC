package docsStorage.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import docsStorage.com.model.Docs;

@Repository
public interface DocRepository extends JpaRepository<Docs, Integer> {

}
