package com.project.issuetracker;

import org.springframework.data.repository.CrudRepository;

public interface IssueRepository extends CrudRepository<Issue,Long> {
    
}
