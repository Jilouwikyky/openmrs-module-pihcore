package org.openmrs.module.pihcore.config;

public class Components {

        public static final String VISIT_MANAGEMENT = "visitManagement";
        public static final String ACTIVE_VISITS = "activeVisits";
        public static final String CHECK_IN = "checkIn";
        public static final String CHECK_IN_HOMEPAGE_APP = "checkInHomepageApp";
        public static final String UHM_VITALS = "uhmVitals";
        public static final String VITALS = "vitals";
        public static final String CONSULT = "consult";
        public static final String ED_CONSULT = "edConsult";
        public static final String ADT = "adt";
        public static final String DEATH_CERTIFICATE = "deathCertificate";
        public static final String RADIOLOGY = "radiology";
        public static final String DISPENSING = "dispensing";
        public static final String SURGERY = "surgery";
        public static final String ONCOLOGY = "oncology";  // program
        public static final String NCD = "ncd";  // program
        public static final String HIV = "hiv";  // program. Needs HIVProgramBundle and Haiti HIV MDS package
        public static final String VCT = "vct";
        public static final String MCH = "mch";  // mchForms + mchProgram
        public static final String MCH_FORMS = "mchForms";  // used by ZL (via "mch")
        public static final String MCH_PROGRAM = "mchProgram";  // needs MCHProgramBundle[ZL], used by ZL (via "mch")
        public static final String VACCINATION_FORM = "vaccination";
        public static final String ZIKA = "zika";  // program
        public static final String ANC_PROGRAM = "ancProgram";  // needs ANCProgramBundle, used by CES
        public static final String ASTHMA_PROGRAM = "asthmaProgram";  // needs AsthmaProgramBundle, used by CES
        public static final String MENTAL_HEALTH= "mentalHealth";  // mentalHealthForm + mentalHealthProgram
        public static final String MENTAL_HEALTH_FORM = "mentalHealthForm";  // used by ZL (via "mentalHealth")
        public static final String MENTAL_HEALTH_PROGRAM = "mentalHealthProgram";  // needs MentalHealthProgram bundle, used by ZL and CES
        public static final String HYPERTENSION_PROGRAM = "hypertensionProgram";  // needs HypertensionProgram bundle, used by CES
        public static final String DIABETES_PROGRAM = "diabetesProgram";  // needs DiabetesProgram bundle, used by CES
        public static final String EPILEPSY_PROGRAM = "epilepsyProgram";  // needs EpilepsyProgramBundle, used by CES
        public static final String MALNUTRITION_PROGRAM = "malnutritionProgram";  // needs MalnutritionProgramBundle, used by CES
        public static final String SOCIO_ECONOMICS= "socioEconomics";
        public static final String LAB_RESULTS = "labResults";
        public static final String OVERVIEW_REPORTS = "overviewReports";
        public static final String MONITORING_REPORTS = "monitoringReports";
        public static final String DATA_EXPORTS = "dataExports";  // enabled the data export section
        public static final String ALL_DATA_EXPORTS = "allDataExports"; // show all data exports, regardless of what components are actually enabled (used by Mirebalais reporting server)
        public static final String ARCHIVES = "archives";
        public static final String WRISTBANDS = "wristbands";
        public static final String APPOINTMENT_SCHEDULING = "appointmentScheduling";
        public static final String SYSTEM_ADMINISTRATION = "systemAdministration";
        public static final String MANAGE_PRINTERS = "managePrinters";
        public static final String MY_ACCOUNT = "myAccount";
        public static final String PATIENT_REGISTRATION = "patientRegistration";
        public static final String CLINICIAN_DASHBOARD = "clinicianDashboard";
        public static final String BMI_ON_CLINICIAN_DASHBOARD = "bmiOnClinicianDashboard";
        public static final String VISIT_NOTE = "visitNote";  // get rid of the left visits bar and enable form sections
        public static final String ALLERGIES = "allergies";
        public static final String PRESCRIPTIONS = "prescriptions";
        public static final String LEGACY_MPI = "legacyMpi";
        public static final String LACOLLINE_PATIENT_REGISTRATION_ENCOUNTER_TYPES = "lacollinePatientRegistrationEncounterTypes";
        public static final String ID_CARD_PRINTING = "idcardPrinting";
        public static final String CHART_SEARCH = "chartSearch";
        public static final String WAITING_FOR_CONSULT = "waitingForConsult";
        public static final String PRIMARY_CARE = "primaryCare";  // primary care forms for Haiti, Mexico, and Sierra Leone (country-dependent)
        public static final String PACS_INTEGRATION = "pacsIntegration";
        public static final String ED_TRIAGE = "edTriage";
        public static final String ED_TRIAGE_QUEUE = "edTriageQueue";
        public static final String BIOMETRICS_FINGERPRINTS = "biometricsFingerPrints";
        public static final String TODAYS_VISITS = "todaysVisits";
        public static final String PATHOLOGY_TRACKING = "pathologyTracking";
        public static final String LABS = "labs";
        public static final String PROGRAMS = "programs";
        public static final String RELATIONSHIPS = "relationships";
        public static final String PROVIDER_RELATIONSHIPS = "providerRelationships";  // the Relationships widget, configured for providers
        public static final String EXPORT_PATIENTS = "exportPatients";
        public static final String IMPORT_PATIENTS = "importPatients";
        public static final String PATIENT_DOCUMENTS = "patientDocuments";  // openmrs-module-attachments
        public static final String CHW_APP = "chwApp";  // openmrs-module-providermanagement
        public static final String CONDITION_LIST = "conditionList";  // a dashboard widget that lists "conditions"
        public static final String ORDER_ENTRY = "orderEntry";  // TODO we probably want a different name for this?  break up by drug orders and lab orders, etc?
        public static final String COHORT_BUILDER = "cohortBuilder";
        public static final String CHEMOTHERAPY = "chemotherapy";
}
