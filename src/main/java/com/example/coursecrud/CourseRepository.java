package com.example.coursecrud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    // Custom query methods can be added here if needed
    // Example: Find courses by instructor
    // List<Course> findByInstructor(String instructor);
}