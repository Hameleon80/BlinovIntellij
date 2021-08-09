package chapter6.student;

/**
 * Ahtirskij Yuriy 09.08.2021
 */
public class CorrespondenceStudent extends Student{
    //==================== Constructors ====================

    public CorrespondenceStudent() {
    }

    public CorrespondenceStudent(String name, String address, double znoResult) {
        super(name, address, znoResult);
    }

    public CorrespondenceStudent(String name, String address, String university, String faculty, String speciality, double znoResult) {
        super(name, address, university, faculty, speciality, znoResult);
    }

    @Override
    public boolean enroll(String university, String faculty, String speciality) {
        if(university==null || faculty==null || speciality==null || university.isEmpty() || faculty.isEmpty() ||
            speciality.isEmpty()){
            return false;
        }
        this.setUniversity(university);
        this.setFaculty(faculty);
        this.setSpeciality(speciality);
        return true;
    }

    //==================== Overridden methods ====================
    @Override
    public boolean expel() {
        if(getUniversity()==null || getFaculty()==null || getSpeciality()==null){
            return false;
        }
        setUniversity(null);
        setFaculty(null);
        setSpeciality(null);
        return true;
    }
}
