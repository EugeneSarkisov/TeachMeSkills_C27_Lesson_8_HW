# TeachMeSkills_C27_Lesson_8_HW

"Clinic" task
We created abstract class "Doctor" and interfaces "Treatable". Next, we implement interfaces in abstract class and 
created three child classes - Surgeon, Therapist and Dentist. In all classes we implemetded method "treat". 
Next, we organized this three classes in one class "DoctorList", made a getter methods for "Doctor" objects and access to 
their threat methods. 
Then, we created "Patient" class with two fileds - treatment plan and doctor (objects - Doctor) - and setter for doctor field. 
In therapist class, we made method prescribeTreatment with patient parameter, which set a doctor and take a necessary method in 
DoctorList. 

Test scenario:
-create new DoctorList;
-create three new patients with three different treatmentPlan;
-call method prescribeTreatment from DoctorList for all three patients.
