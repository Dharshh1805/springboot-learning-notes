package com.contactManagement.Contact_demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contactManagement.Contact_demo.models.CallLogEntity;

public interface CallLogInterface extends JpaRepository<CallLogEntity,Long>{

}
