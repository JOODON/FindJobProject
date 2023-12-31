package com.example.findjobproject.service

import com.example.findjobproject.data.MainCategoryList
import com.example.findjobproject.data.MajorCategoryList
import com.example.findjobproject.data.subCategoryList
import com.example.findjobproject.entitty.MainCategory
import com.example.findjobproject.entitty.SubCategory
import com.example.findjobproject.repository.MainCategoryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class MainCategoryService(
    @Autowired
    private val mainCategoryRepository: MainCategoryRepository
) {

    fun saveMainCategory(mainCategory:MainCategory) : MainCategory{
        return mainCategoryRepository.save(mainCategory)
    }


}

fun main() {
//
//    for (list in MainCategoryList){
//        println(list)
//    }

//    for (list in MajorCategoryList){
//        println(list)
//    }
//
    for (list in subCategoryList){
        println(list)
    }
}
