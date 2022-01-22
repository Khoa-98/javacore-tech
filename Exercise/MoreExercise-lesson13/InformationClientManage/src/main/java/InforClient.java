import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter


public class InforClient {
    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("dateofbirth")
    private String dateofbirth;
    @SerializedName("gender")
    private Gender gender;
    @SerializedName("location")
    private String location;
    @SerializedName("numberphone")
    private String numberphone;
    @SerializedName("email")
    private String email;

    @Override
    public String toString() {
        return "Client:  " + id +
                " - " + name + '\'' +
                " - " + dateofbirth +
                " - " + gender +
                " - " + location + '\'' +
                " - " + numberphone + '\'' +
                " - " + email + '\'';
    }

}
