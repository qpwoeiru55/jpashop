package jpabook.jpashop.domain;


import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseEntity {

    @Column(name = "CREATED_BY")
    private String createBy;

    @Column(name = "CREATED_DATE")
    private LocalDateTime createDate;

    @Column(name = "MODIFIED_BY")
    private String lasModifiedBy;

    @Column(name = "MODIFIED_DATE")
    private LocalDateTime lasModifiedDate;

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public String getLasModifiedBy() {
        return lasModifiedBy;
    }

    public void setLasModifiedBy(String lasModifiedBy) {
        this.lasModifiedBy = lasModifiedBy;
    }

    public LocalDateTime getLasModifiedDate() {
        return lasModifiedDate;
    }

    public void setLasModifiedDate(LocalDateTime lasModifiedDate) {
        this.lasModifiedDate = lasModifiedDate;
    }
}
