package com.example.findjobproject.service

import com.example.findjobproject.data.exAnnouncementList
import com.example.findjobproject.entitty.Announcement
import com.example.findjobproject.entitty.category.SubCategory
import com.example.findjobproject.repository.AnnouncementRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class AnnouncementService(
    @Autowired
    private val announcementRepository: AnnouncementRepository
) {

    //기업 필터링
    fun getCompaniesByIndustry(selectCategories: List<SubCategory>): List<Announcement> {
        val resultAnnouncement: MutableList<Announcement> = mutableListOf()

        for (selectCategory in selectCategories){
                val announcements = announcementRepository.findAllByIndustry(selectCategory.typeOfBusiness)

                announcements.forEach {
                    print("$it  ")
                    resultAnnouncement.add(it)
                }
            }
            return resultAnnouncement
        }


//        for (selectCategory in selectCategories) {
//            //1. SELECT Category를 기반으로
//            for (announcement in exAnnouncementList){
//                //anno에서
//                if (announcement.industry.equals(selectCategory.typeOfBusiness)){
//                    resultAnnouncement.add(announcement)
//                }
//            }
//        }



    fun saveAnnouncement(announcement : Announcement){
        announcementRepository.save(announcement)
    }

    fun saveAnnouncementList(announcements : List<Announcement>){
        announcements.forEach{
            saveAnnouncement(it)
        }
    }

}