package chapter6.student;

/**
 * Interface sets common functionality for all entities Student.
 *
 * Ahtirskij Yuriy 09.08.2021
 */
public interface IEnrollee {
    /**
     * Enrolls student to specified university, faculty, speciality.
     *
     * @param university - university name
     * @param faculty - faculty name
     * @param speciality - speciality name
     * @return - true if enroll, false if not
     */
    boolean enroll(String university, String faculty, String speciality);

    /**
     * Expel student.
     *
     * @return - true if expel, false if not.
     */
    boolean expel();
}
