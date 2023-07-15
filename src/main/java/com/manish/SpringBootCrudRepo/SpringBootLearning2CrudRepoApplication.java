package com.manish.SpringBootCrudRepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.manish.SpringBootCrudRepo.entity.StudentEntity;
import com.manish.SpringBootCrudRepo.repo.StudentRepo;

@SpringBootApplication
public class SpringBootLearning2CrudRepoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootLearning2CrudRepoApplication.class, args);
		StudentRepo bean = context.getBean(StudentRepo.class);
		// StudentEntity entity = new StudentEntity();
		// saving single user student
		/*
		 * entity.setId(3); entity.setName("himanshu"); entity.setRoll(123);
		 * entity.setSurname("vaisnav"); StudentEntity save = bean.save(entity);
		 * System.out.println(save);
		 */
		/*
		 * entity.setId(1); entity.setName("himanshu"); entity.setRoll(123);
		 * entity.setSurname("vaisnav"); StudentEntity save = bean.save(entity);
		 * System.out.println(save);
		 */

		// saving multi user student
		/*
		 * StudentEntity entity1 = new StudentEntity(); entity1.setId(12112);
		 * entity1.setName("himanshu"); entity1.setRoll(123);
		 * entity1.setSurname("vaisnav"); StudentEntity entity2 = new StudentEntity();
		 * entity2.setId(331); entity2.setName("himanshu"); entity2.setRoll(1213);
		 * entity2.setSurname("vaisnav"); StudentEntity entity3 = new StudentEntity();
		 * entity3.setId(2212); entity3.setName("himanshu"); entity3.setRoll(123);
		 * entity3.setSurname("vaisnav");
		 * 
		 * //old way ArrayList<StudentEntity> li = new ArrayList<>(); li.add(entity3);
		 * li.add(entity2); li.add(entity1);
		 * 
		 * // java 8 method List<StudentEntity> li = List.of(entity1, entity2, entity3);
		 * Iterable<StudentEntity> saveAll = bean.saveAll(li);
		 * saveAll.forEach(StudentEntity -> { System.out.println(StudentEntity); });
		 */
		// 2.......update the user
		/*
		 * Optional<StudentEntity> optional = bean.findById(1); StudentEntity entity =
		 * optional.get(); // System.out.println(entity); entity.setName("himanshi");
		 * StudentEntity save = bean.save(entity); System.out.println("update data" +
		 * save);
		 */

		// 3 get the data read the data
		// 1 way
		// FindBy(Id)- return Optional Containing your data
		// 2 FindAll();
		// Iterable<StudentEntity> all = bean.findAll();
		// old way
		/*
		 * Iterator<StudentEntity> iterator = all.iterator(); while (iterator.hasNext())
		 * { StudentEntity studentEntity = iterator.next();
		 * System.out.println(studentEntity); }
		 */

		// new way since java 1.8

		/*
		 * all.forEach(new Consumer<StudentEntity>() {
		 * 
		 * @Override public void accept(StudentEntity t) { System.out.println(t); } });
		 */
		// lambda function
		// all.forEach(StudentEntity -> System.out.println(StudentEntity));
		// 3. delete the student data

		// bean.deleteById(1);

		Iterable<StudentEntity> findAll = bean.findAll();
		findAll.forEach(StudentEntity -> System.out.println(StudentEntity));
		bean.deleteAll(findAll);
	}

}
