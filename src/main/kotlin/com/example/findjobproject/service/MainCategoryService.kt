package com.example.findjobproject.service

import com.example.findjobproject.entitty.Category.MainCategory
import com.example.findjobproject.repository.MainCategoryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MainCategoryService(

    @Autowired
    private val mainCategoryRepository: MainCategoryRepository

) {
    fun findAllMainCategory(): MutableList<MainCategory> {
        return mainCategoryRepository.findAll()
    }
    fun findByMainCategoryID(id : Long) : MainCategory {
        return mainCategoryRepository.findById(id).orElse(null)
    }

}
