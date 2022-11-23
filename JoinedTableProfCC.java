package software1.softwareengineering1.dto;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import software1.softwareengineering1.entity.profile_of_user;
import software1.softwareengineering1.entity.profile_of_user_credit_card;
import software1.softwareengineering1.repository.profile_of_user_repository;


@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
public class JoinedTableProfCC {
    //public profile_of_user_credit_card user_credit_card() {
 //       return user_credit_card;
 //   }

   // public void setProfile_of_user(software1.softwareengineering1.entity.profile_of_user profile_of_user) {
     //   this.profile_of_user = profile_of_user;
    //}

    private profile_of_user user_credit_card;
}
