package member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class MemberDTO {
    private int no;
    private String ID;
    private String NAME;
    private String ADDR;
    private String EMAIL;
    private int AGE;
    private String REMARK;
}
