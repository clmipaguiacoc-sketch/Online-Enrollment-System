-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 15, 2026 at 07:27 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `online_enrollment`
--

-- --------------------------------------------------------

--
-- Table structure for table `advisers`
--

CREATE TABLE `advisers` (
  `adviser_id` int(11) NOT NULL,
  `adviser_name` varchar(100) NOT NULL,
  `grade_level` varchar(20) NOT NULL,
  `section` varchar(100) NOT NULL,
  `school_year` varchar(20) NOT NULL,
  `strand` varchar(100) NOT NULL,
  `quarter` varchar(30) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `advisers`
--

INSERT INTO `advisers` (`adviser_id`, `adviser_name`, `grade_level`, `section`, `school_year`, `strand`, `quarter`) VALUES
(8, 'Joshua Salazar', 'Grade 8', 'G8 SOCRATES', '2027-2028', 'Not Applicable', 'Quarter 2'),
(16, 'Sofia Cruz', 'Grade 7', 'G7 NARRA', '2027-2028', 'Not Applicable', 'Quarter 1');

-- --------------------------------------------------------

--
-- Table structure for table `enrollments`
--

CREATE TABLE `enrollments` (
  `enrollment_id` int(11) NOT NULL,
  `student_id` varchar(30) NOT NULL,
  `semester` varchar(30) NOT NULL,
  `school_year` varchar(20) NOT NULL,
  `section` varchar(100) NOT NULL,
  `subject_id` varchar(50) NOT NULL,
  `subject_name` varchar(150) NOT NULL,
  `schedule` varchar(100) NOT NULL,
  `room` varchar(50) NOT NULL,
  `floor` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `enrollments`
--

INSERT INTO `enrollments` (`enrollment_id`, `student_id`, `semester`, `school_year`, `section`, `subject_id`, `subject_name`, `schedule`, `room`, `floor`) VALUES
(41, '02-2526-0001', 'Quarter 1', '2027-2028', 'G12 VALVE', 'PLUMB12-Q1-01', 'General Mathematics', 'Monday 7:30-8:30 AM', 'Room 101', '1st Floor'),
(42, '02-2526-0001', 'Quarter 1', '2027-2028', 'G12 VALVE', 'PLUMB12-Q1-02', 'Oral Communication', 'Monday 8:30-9:30 AM', 'Room 102', '1st Floor'),
(43, '02-2526-0001', 'Quarter 1', '2027-2028', 'G12 VALVE', 'PLUMB12-Q1-03', 'Plumbing Fundamentals', 'Tuesday 7:30-8:30 AM', 'Room 201', '2nd Floor'),
(44, '02-2526-0001', 'Quarter 1', '2027-2028', 'G12 VALVE', 'PLUMB12-Q1-04', 'Plumbing Installation', 'Tuesday 8:30-9:30 AM', 'Room 202', '2nd Floor'),
(45, '02-2526-0001', 'Quarter 1', '2027-2028', 'G12 VALVE', 'PLUMB12-Q1-05', 'Physical Education', 'Wednesday 7:30-8:30 AM', 'Room 301', '3rd Floor'),
(46, '02-2526-0001', 'Quarter 1', '2027-2028', 'G12 VALVE', 'PLUMB12-Q1-06', 'Plumbing Maintenance', 'Wednesday 8:30-9:30 AM', 'Room 302', '3rd Floor'),
(47, '02-2526-0001', 'Quarter 1', '2027-2028', 'G12 VALVE', 'PLUMB12-Q1-07', 'Pipe Installation', 'Thursday 7:30-8:30 AM', 'Room 401', '4th Floor'),
(48, '02-2526-0001', 'Quarter 1', '2027-2028', 'G12 VALVE', 'PLUMB12-Q1-08', 'Research Fundamentals', 'Friday 7:30-8:30 AM', 'Room 402', '4th Floor'),
(49, '02-2526-0003', 'Quarter 1', '2027-2028', 'G12 APOLLO', 'STEM12-Q1-01', 'General Mathematics', 'Monday 7:30-8:30 AM', 'Room 101', '1st Floor'),
(50, '02-2526-0003', 'Quarter 1', '2027-2028', 'G12 APOLLO', 'STEM12-Q1-02', 'Oral Communication', 'Monday 8:30-9:30 AM', 'Room 102', '1st Floor'),
(51, '02-2526-0003', 'Quarter 1', '2027-2028', 'G12 APOLLO', 'STEM12-Q1-03', 'Earth Science', 'Tuesday 7:30-8:30 AM', 'Room 201', '2nd Floor'),
(52, '02-2526-0003', 'Quarter 1', '2027-2028', 'G12 APOLLO', 'STEM12-Q1-04', '21st Century Literature', 'Tuesday 8:30-9:30 AM', 'Room 202', '2nd Floor'),
(53, '02-2526-0003', 'Quarter 1', '2027-2028', 'G12 APOLLO', 'STEM12-Q1-05', 'Physical Education', 'Wednesday 7:30-8:30 AM', 'Room 301', '3rd Floor'),
(54, '02-2526-0003', 'Quarter 1', '2027-2028', 'G12 APOLLO', 'STEM12-Q1-06', 'Pre-Calculus', 'Wednesday 8:30-9:30 AM', 'Room 302', '3rd Floor'),
(55, '02-2526-0003', 'Quarter 1', '2027-2028', 'G12 APOLLO', 'STEM12-Q1-07', 'Basic Calculus', 'Thursday 7:30-8:30 AM', 'Room 401', '4th Floor'),
(56, '02-2526-0003', 'Quarter 1', '2027-2028', 'G12 APOLLO', 'STEM12-Q1-08', 'Research Fundamentals', 'Friday 7:30-8:30 AM', 'Room 402', '4th Floor'),
(57, '02-2526-0006', 'Quarter 1', '2026-2027', 'G7 NARRA', 'G7-Q1-01', 'English 7', 'Monday-Friday 7:30-8:30 AM', 'Room 101', '1st Floor'),
(58, '02-2526-0006', 'Quarter 1', '2026-2027', 'G7 NARRA', 'G7-Q1-02', 'Mathematics 7', 'Monday-Friday 8:30-9:30 AM', 'Room 101', '1st Floor'),
(59, '02-2526-0006', 'Quarter 1', '2026-2027', 'G7 NARRA', 'G7-Q1-03', 'Science 7', 'Monday-Friday 9:30-10:30 AM', 'Room 101', '1st Floor'),
(60, '02-2526-0006', 'Quarter 1', '2026-2027', 'G7 NARRA', 'G7-Q1-04', 'Filipino 7', 'Monday-Friday 10:30-11:30 AM', 'Room 101', '1st Floor'),
(61, '02-2526-0006', 'Quarter 1', '2026-2027', 'G7 NARRA', 'G7-Q1-05', 'Araling Panlipunan 7', 'Monday-Friday 1:00-2:00 PM', 'Room 101', '1st Floor'),
(62, '02-2526-0006', 'Quarter 1', '2026-2027', 'G7 NARRA', 'G7-Q1-06', 'MAPEH 7', 'Monday-Friday 2:00-3:00 PM', 'Room 101', '1st Floor'),
(63, '02-2526-0006', 'Quarter 1', '2026-2027', 'G7 NARRA', 'G7-Q1-07', 'TLE 7', 'Monday-Friday 3:00-4:00 PM', 'Room 101', '1st Floor'),
(64, '02-2526-0006', 'Quarter 1', '2026-2027', 'G7 NARRA', 'G7-Q1-08', 'Values Education 7', 'Monday-Friday 4:00-5:00 PM', 'Room 101', '1st Floor'),
(65, '02-2526-0008', 'Quarter 2', '2027-2028', 'G8 SOCRATES', 'G8-Q2-01', 'Creative English 8', 'Monday-Friday 7:30-8:30 AM', 'Room 101', '1st Floor'),
(66, '02-2526-0008', 'Quarter 2', '2027-2028', 'G8 SOCRATES', 'G8-Q2-02', 'Advanced Mathematics 8', 'Monday-Friday 8:30-9:30 AM', 'Room 101', '1st Floor'),
(67, '02-2526-0008', 'Quarter 2', '2027-2028', 'G8 SOCRATES', 'G8-Q2-03', 'Earth and Life Science 8', 'Monday-Friday 9:30-10:30 AM', 'Room 101', '1st Floor'),
(68, '02-2526-0008', 'Quarter 2', '2027-2028', 'G8 SOCRATES', 'G8-Q2-04', 'Pagbasa at Pagsulat 8', 'Monday-Friday 10:30-11:30 AM', 'Room 101', '1st Floor'),
(69, '02-2526-0008', 'Quarter 2', '2027-2028', 'G8 SOCRATES', 'G8-Q2-05', 'Philippine History 8', 'Monday-Friday 1:00-2:00 PM', 'Room 101', '1st Floor'),
(70, '02-2526-0008', 'Quarter 2', '2027-2028', 'G8 SOCRATES', 'G8-Q2-06', 'Arts and Music 8', 'Monday-Friday 2:00-3:00 PM', 'Room 101', '1st Floor'),
(71, '02-2526-0008', 'Quarter 2', '2027-2028', 'G8 SOCRATES', 'G8-Q2-07', 'Technology 8', 'Monday-Friday 3:00-4:00 PM', 'Room 101', '1st Floor'),
(72, '02-2526-0008', 'Quarter 2', '2027-2028', 'G8 SOCRATES', 'G8-Q2-08', 'Character Education 8', 'Monday-Friday 4:00-5:00 PM', 'Room 101', '1st Floor'),
(73, '02-2526-0009', 'Quarter 1', '2027-2028', 'G8 SOCRATES', 'G8-Q1-01', 'English 8', 'Monday-Friday 7:30-8:30 AM', 'Room 101', '1st Floor'),
(74, '02-2526-0009', 'Quarter 1', '2027-2028', 'G8 SOCRATES', 'G8-Q1-02', 'Mathematics 8', 'Monday-Friday 8:30-9:30 AM', 'Room 101', '1st Floor'),
(75, '02-2526-0009', 'Quarter 1', '2027-2028', 'G8 SOCRATES', 'G8-Q1-03', 'Science 8', 'Monday-Friday 9:30-10:30 AM', 'Room 101', '1st Floor'),
(76, '02-2526-0009', 'Quarter 1', '2027-2028', 'G8 SOCRATES', 'G8-Q1-04', 'Filipino 8', 'Monday-Friday 10:30-11:30 AM', 'Room 101', '1st Floor'),
(77, '02-2526-0009', 'Quarter 1', '2027-2028', 'G8 SOCRATES', 'G8-Q1-05', 'Araling Panlipunan 8', 'Monday-Friday 1:00-2:00 PM', 'Room 101', '1st Floor'),
(78, '02-2526-0009', 'Quarter 1', '2027-2028', 'G8 SOCRATES', 'G8-Q1-06', 'MAPEH 8', 'Monday-Friday 2:00-3:00 PM', 'Room 101', '1st Floor'),
(79, '02-2526-0009', 'Quarter 1', '2027-2028', 'G8 SOCRATES', 'G8-Q1-07', 'TLE 8', 'Monday-Friday 3:00-4:00 PM', 'Room 101', '1st Floor'),
(80, '02-2526-0009', 'Quarter 1', '2027-2028', 'G8 SOCRATES', 'G8-Q1-08', 'Values Education 8', 'Monday-Friday 4:00-5:00 PM', 'Room 101', '1st Floor'),
(81, '02-2526-0011', 'Quarter 3', '2027-2028', 'G10 MERCURY', 'G10-Q3-01', 'Reading and Literature 10', 'Monday-Friday 7:30-8:30 AM', 'Room 101', '1st Floor'),
(82, '02-2526-0011', 'Quarter 3', '2027-2028', 'G10 MERCURY', 'G10-Q3-02', 'Algebra 10', 'Monday-Friday 8:30-9:30 AM', 'Room 101', '1st Floor'),
(83, '02-2526-0011', 'Quarter 3', '2027-2028', 'G10 MERCURY', 'G10-Q3-03', 'Physical Science 10', 'Monday-Friday 9:30-10:30 AM', 'Room 101', '1st Floor'),
(84, '02-2526-0011', 'Quarter 3', '2027-2028', 'G10 MERCURY', 'G10-Q3-04', 'Panitikan 10', 'Monday-Friday 10:30-11:30 AM', 'Room 101', '1st Floor'),
(85, '02-2526-0011', 'Quarter 3', '2027-2028', 'G10 MERCURY', 'G10-Q3-05', 'World History 10', 'Monday-Friday 1:00-2:00 PM', 'Room 101', '1st Floor'),
(86, '02-2526-0011', 'Quarter 3', '2027-2028', 'G10 MERCURY', 'G10-Q3-06', 'Health and Fitness 10', 'Monday-Friday 2:00-3:00 PM', 'Room 101', '1st Floor'),
(87, '02-2526-0011', 'Quarter 3', '2027-2028', 'G10 MERCURY', 'G10-Q3-07', 'Computer Technology 10', 'Monday-Friday 3:00-4:00 PM', 'Room 101', '1st Floor'),
(88, '02-2526-0011', 'Quarter 3', '2027-2028', 'G10 MERCURY', 'G10-Q3-08', 'Good Citizenship 10', 'Monday-Friday 4:00-5:00 PM', 'Room 101', '1st Floor');

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `student_id` varchar(30) NOT NULL,
  `username` varchar(50) NOT NULL,
  `name` varchar(100) NOT NULL,
  `age` int(11) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `course` varchar(100) NOT NULL,
  `year_level` varchar(30) NOT NULL,
  `semester` varchar(30) NOT NULL,
  `school_year` varchar(20) NOT NULL,
  `contact_number` varchar(30) NOT NULL,
  `email` varchar(100) NOT NULL,
  `birthdate` date DEFAULT NULL,
  `enrollment_status` varchar(30) NOT NULL DEFAULT 'PENDING',
  `section` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`student_id`, `username`, `name`, `age`, `gender`, `course`, `year_level`, `semester`, `school_year`, `contact_number`, `email`, `birthdate`, `enrollment_status`, `section`) VALUES
('02-2526-0001', 'Nash', 'NASH JANDE PASIN YORONG', 19, 'Male', 'TVL Plumbing', 'Grade 12', 'Quarter 1', '2027-2028', '09368327884', 'nashjande@gmail.com', NULL, 'APPROVED', NULL),
('02-2526-0002', 'CHLOUE', 'CHLOUE MARIE UDANG RALUTO', 20, 'Female', 'STEM', 'Grade 12', 'Quarter 1', '2027-2028', '09651295753', 'chlouemarie@gmail.com', NULL, 'PENDING', NULL),
('02-2526-0003', 'raluto', 'CHLOUE MARIE RALUTO', 20, 'Female', 'STEM', 'Grade 12', 'Quarter 1', '2027-2028', '09651295753', 'chlouemarie@gmail.com', NULL, 'APPROVED', NULL),
('02-2526-0004', 'test', 'NASH JANDE YORONG', 19, 'Male', 'Not Applicable', 'Grade 7', 'Quarter 3', '2026-2027', '09368327884', 'yorongjande@gmail.com', NULL, 'PENDING', NULL),
('02-2526-0005', 'kuan', 'Nash Jande P. Yorong', 19, 'Male', 'Not Applicable', 'Grade 7', 'Quarter 2', '2027-2028', '09368327884', 'nashjande@gmail.com', NULL, 'PENDING', NULL),
('02-2526-0006', 'last', 'ROUGE GIAN SABURAO', 19, 'Male', 'Not Applicable', 'Grade 7', 'Quarter 1', '2026-2027', '09876567822', 'saburao4@gmail.com', NULL, 'APPROVED', NULL),
('02-2526-0007', 'HAYNAKO', 'NASH JANDE YORONG', 19, 'Male', 'Not Applicable', 'Grade 7', 'Quarter 1', '2027-2028', '09368327884', 'yorongjande@gmail.com', NULL, 'PENDING', NULL),
('02-2526-0008', 'UGMA', 'AMBOT', 12, 'Male', 'Not Applicable', 'Grade 8', 'Quarter 2', '2027-2028', '0928789827', 'SDASDA@gmail.com', NULL, 'PENDING', NULL),
('02-2526-0009', 'MARIE', 'CHLOUE MARIE UDANG RALUTO', 20, 'Female', 'Not Applicable', 'Grade 8', 'Quarter 1', '2027-2028', '09651295753', 'chlouemarie@gmail.com', NULL, 'APPROVED', NULL),
('02-2526-0010', 'TESTING', 'NASH JANDE YORONG', 19, 'Male', 'Not Applicable', 'Grade 9', 'Quarter 3', '2027-2028', '09368327884', 'yorongjande@gmail.com', NULL, 'PENDING', NULL),
('02-2526-0011', 'LOKI', 'NASH JANDE P. YORONG', 19, 'Male', 'Not Applicable', 'Grade 10', 'Quarter 3', '2027-2028', '09368327884', 'yorongjande@gmail.com', NULL, 'APPROVED', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `subjects`
--

CREATE TABLE `subjects` (
  `subject_id` varchar(50) NOT NULL,
  `subject_name` varchar(150) NOT NULL,
  `course` varchar(100) NOT NULL,
  `school_year` varchar(20) NOT NULL,
  `grade_level` varchar(30) NOT NULL,
  `semester` varchar(30) NOT NULL,
  `schedule` varchar(100) NOT NULL,
  `room` varchar(50) NOT NULL,
  `floor` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `subject_advisers`
--

CREATE TABLE `subject_advisers` (
  `id` int(11) NOT NULL,
  `subject_name` varchar(255) NOT NULL,
  `adviser_name` varchar(120) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `subject_advisers`
--

INSERT INTO `subject_advisers` (`id`, `subject_name`, `adviser_name`) VALUES
(1, 'English 8', 'Maria Gonzales'),
(2, 'Mathematics 8', 'Monica Tan'),
(3, 'Science 8', 'Nicole Salazar'),
(4, 'Filipino 8', 'Beatrice Fernandez'),
(5, 'Araling Panlipunan 8', 'Rachel Diaz'),
(6, 'MAPEH 8', 'Gabriel Garcia'),
(7, 'TLE 8', 'Carlos Pascual'),
(8, 'Values Education 8', 'Lorenzo Morales'),
(9, 'Reading and Literature 9', 'Isabella Mendoza'),
(10, 'Algebra 9', 'Miguel Reyes'),
(11, 'Physical Science 9', 'Jasmine Castro'),
(12, 'Panitikan 9', 'Patricia Villanueva'),
(13, 'World History 9', 'Anthony Aguilar'),
(14, 'Health and Fitness 9', 'Joshua Aquino'),
(15, 'Computer Technology 9', 'Vincent Lim'),
(16, 'Good Citizenship 9', 'Clarisse Domingo'),
(17, 'Statistics', 'Rafael Rivera'),
(18, 'Academic Writing', 'Matthew Manalo'),
(19, 'Advanced Plumbing', 'Camille Navarro'),
(20, 'Entrepreneurship', 'Bianca Santiago'),
(21, 'Plumbing Safety', 'Patrick Valdez'),
(22, 'Plumbing Repair', 'Samuel Dela Cruz'),
(23, 'Work Immersion Preparation', 'Daniel Bautista'),
(24, 'Personal Development', 'Angela Castillo'),
(25, 'Reading and Literature 10', 'Andrea Santos'),
(26, 'Algebra 10', 'Sofia Cruz'),
(27, 'Physical Science 10', 'Nathan Flores'),
(28, 'Panitikan 10', 'Adrian Ramos'),
(29, 'World History 10', 'Christine Torres'),
(30, 'Health and Fitness 10', 'Joseph Mercado');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` varchar(20) NOT NULL DEFAULT 'student',
  `birthday` date DEFAULT NULL,
  `security_question` varchar(255) NOT NULL,
  `security_answer` varchar(255) NOT NULL,
  `student_id` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `password`, `role`, `birthday`, `security_question`, `security_answer`, `student_id`) VALUES
(1, 'admin', 'admin123', 'admin', '2000-01-01', 'What is your favorite color?', 'blue', NULL),
(9, 'Nash', 'Jande', 'user', NULL, 'Where is your birthplace?', 'CDO', NULL),
(10, 'CHLOUE', 'MARIE', 'user', NULL, 'What is your favorite color?', 'BURGUNDY', NULL),
(12, 'raluto', 'raluto', 'user', NULL, 'What is your favorite color?', 'red', NULL),
(13, 'test', 'test', 'user', NULL, 'What is your favorite color?', 'red', NULL),
(14, 'kuan', 'kuan', 'user', NULL, 'What is your favorite color?', 'red', NULL),
(15, 'last', 'lastyawa', 'user', NULL, 'What is your favorite color?', 'black', NULL),
(16, 'HAYNAKO', 'HAYNAKO', 'user', NULL, 'What is your favorite color?', 'RED', NULL),
(17, 'UGMA', 'NASAD', 'user', NULL, 'What is your favorite color?', 'BLACK', NULL),
(19, 'MARIE', 'MARIE', 'user', NULL, 'What is your favorite color?', 'BLACK', NULL),
(20, 'TESTING', 'TEST', 'user', NULL, 'What is your favorite color?', 'WHITE', NULL),
(21, 'LOKI', 'KAGOME', 'user', NULL, 'What is your favorite food?', 'ADOBO', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `advisers`
--
ALTER TABLE `advisers`
  ADD PRIMARY KEY (`adviser_id`),
  ADD UNIQUE KEY `unique_adviser_assignment` (`grade_level`,`section`,`strand`,`quarter`,`school_year`);

--
-- Indexes for table `enrollments`
--
ALTER TABLE `enrollments`
  ADD PRIMARY KEY (`enrollment_id`),
  ADD KEY `fk_enrollment_student` (`student_id`);

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`student_id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indexes for table `subjects`
--
ALTER TABLE `subjects`
  ADD PRIMARY KEY (`subject_id`);

--
-- Indexes for table `subject_advisers`
--
ALTER TABLE `subject_advisers`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `subject_name` (`subject_name`),
  ADD UNIQUE KEY `adviser_name` (`adviser_name`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `advisers`
--
ALTER TABLE `advisers`
  MODIFY `adviser_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `enrollments`
--
ALTER TABLE `enrollments`
  MODIFY `enrollment_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=89;

--
-- AUTO_INCREMENT for table `subject_advisers`
--
ALTER TABLE `subject_advisers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `enrollments`
--
ALTER TABLE `enrollments`
  ADD CONSTRAINT `fk_enrollment_student` FOREIGN KEY (`student_id`) REFERENCES `students` (`student_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;