package software1.softwareengineering1.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import software1.softwareengineering1.dto.JoinedTableProfCC;
import software1.softwareengineering1.entity.profile_of_user;
//import software1.softwareengineering1.entity.profile_of_user_credit_card;
import software1.softwareengineering1.entity.profile_of_user_credit_card;
import software1.softwareengineering1.repository.profile_of_user_repository;
import software1.softwareengineering1.service.profile_of_user_service;

import java.sql.SQLOutput;
import java.util.List;

@RestController
public class profile_of_user_controller {

    @Autowired
    private profile_of_user_service Profile_of_user_service;

    @Autowired
    private profile_of_user_repository test;

   // @Autowired
   // private profile_of_user_credit_card profile_of_user_credit_card_variable;


  /*  @PostMapping("/Create_CC")
    public profile_of_user profile_of_user_credit_card(@RequestBody JoinedTableProfCC request){
       return test.save(request.getUser_credit_card());
    }
*/
    @PostMapping("/create_profile")
    public profile_of_user Save_user_controller(@RequestBody profile_of_user Profile_user) {
        return Profile_of_user_service.Save_user_controller(Profile_user);

    }

    @GetMapping("/get_all_profile")
    public List<profile_of_user> fetchingList() {
        return Profile_of_user_service.fetchingList();
    }

    @GetMapping("/profile_by_id/{id}")
    public profile_of_user fetchingListByID(@PathVariable("id") String User_ID) {
        return Profile_of_user_service.fetchingListByID(User_ID);
    }

    @DeleteMapping("/profile_delete_ById/{id}")
    public String deleteProfileByUserEmailID(@PathVariable("id") String User_ID) {

        if(Profile_of_user_service.deleteProfileByUserEmailID(User_ID)){
            return "User has successfully deleted profile.";
        }
        else{
            return"No user found with given ID.";
        }

    }

    @PutMapping("/profile_update/{id}")
    public profile_of_user update_profile_attributes(@PathVariable("id") String User_ID,
                                                     @RequestBody profile_of_user profile_user_attributes) {

        return Profile_of_user_service.update_profile_attributes(User_ID, profile_user_attributes);
    }





}
