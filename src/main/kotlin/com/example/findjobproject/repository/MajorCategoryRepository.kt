package com.example.findjobproject.repository

import com.example.findjobproject.entitty.Category.MajorCategory
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MajorCategoryRepository : JpaRepository<MajorCategory, Long>{
}