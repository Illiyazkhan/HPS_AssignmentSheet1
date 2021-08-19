package io.javabrains.springbootstarter.topic;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface TopicRepository extends JpaRepository<Topic , String> {
	
	@Query(value="SELECT * from topic t",nativeQuery=true)
	public List<Topic> findEverything();
	
	@Query(value="SELECT * from topic t WHERE t.topic_id= :topic_id",nativeQuery=true)
	public Topic findParticularTopic(@Param("topic_id") String id);
	
	@Modifying
	@Query(value="INSERT INTO topic (topic_id,topic_name,topic_description)VALUES (:topic_id,:topic_name,:topic_description)",nativeQuery=true)
	@Transactional
	public void addingNewTopic(@Param("topic_id") String id,@Param("topic_name") String name,@Param("topic_description")String description);
	
	@Modifying
	@Query(value="UPDATE topic t SET t.topic_id=:topic_id,t.topic_name=:topic_name,t.topic_description=:topic_description WHERE (t.topic_id=:ntopic_id)",nativeQuery=true)
	@Transactional
	public void updatingTopic(@Param("ntopic_id") String id,@Param("topic_id")String id1,@Param("topic_name") String name,@Param("topic_description")String description);

	@Modifying
	@Query(value="DELETE FROM topic t WHERE t.topic_id=:topic_id",nativeQuery=true)
	@Transactional
	public void deletingTopic(@Param("topic_id") String id);
	
	//below methods are without native query
	//using JPQL
	
	@Query(value="SELECT t FROM Topic t")
	public List<Topic> findEverything_1();
	
	
	@Query(value="SELECT t FROM Topic t WHERE t.id= :topic_id")
	public Topic findParticularTopic_1(@Param("topic_id") String id);
	
	@Modifying
	@Query(value="UPDATE Topic t SET t.id=:topic_id,t.name=:topic_name,t.description=:topic_description WHERE (t.id=:ntopic_id)")
	@Transactional
	public void updatingTopic_1(@Param("ntopic_id") String id,@Param("topic_id")String id1,@Param("topic_name") String name,@Param("topic_description")String description);
	
	
	@Modifying
	@Query(value="DELETE FROM Topic t WHERE t.id=:topic_id")
	@Transactional
	public void deletingTopic_1(@Param("topic_id") String id);

}
