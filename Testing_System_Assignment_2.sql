USE `Testing_System_1`

-- Thêm dữ liệu vào bảng Department
INSERT INTO Department(DepartmentID, DepartmentName)
VALUES
						(1,				N'Giám Đốc'         );
						(2,				N' Marketing'    );
						(3,				N'Kế Toán'       );
						(4, 			N'Tài chính'    );
						(5,				N'Trưởng phòng' );
-- Thêm dữ liệu vào bảng Position
INSERT INTO Position1(PositionID, PositionName)
VALUES
						(1, 		N'Dev'          );
						(2, 		N'Test'         );
						(3, 		N'Scrum Master' );
						(4, 		N'PM'           );
-- Thêm dữ liệu vào bảng Account
INSERT INTO Account 	(AccountID, 	Email, 					User_name, 			Full_name, 				DepartmentID, 			PositionID,			 CreateDate)
VALUES
						(1, 			'minh@gmail.com', 		'Minh2207', 		'Do Tuan Minh', 		3, 						1, 					01/02/2021);
						(2, 			'linh@gmail.com', 		'Linh1207', 		'Pham Dieu Linh', 		1, 						1, 					02/03/2021);
						(3, 			'giang@gmail.com', 		'giang 123', 		'Nguyen Hau Giang', 	3, 						4, 					03/04/2021);
						(4, 			'binh@gmail.com', 		'Binh1234', 		'Nguyen Hai Binh', 		4, 						2, 					04/05/2021);
						(5, 			'van@gmail.com', 		'vantholailang', 	'Hua Vi Van',		 	5, 						2, 					5/06/2021);
-- Thêm dữ liệu vào bảng Group
INSERT INTO Group		(GroupID, 		GroupName, 			CreatorID, 			CreateDate)
VALUES
						(1, 			'Group_A', 			11, 				22/07/2021);
						(2, 			'Group_B',			12, 				12/07/2021);
						(3, 			'Group_C', 			13,					 06/09/2021);
						(4, 			'Group_D', 			14, 				14/10/2021);
						(5, 			'Group_E', 			15, 				15/12/2021);
-- Thêm dữ liệu vào bảng Group Account
INSERT INTO GroupAccount(GroupID, 			AccountID, 		JoinDate)
VALUES
							(1, 			1, 				02/05/2021);
							(2, 			2, 				03/04/2021);
							(3, 			3, 				04/05/2021);
							(4, 			4, 				05/06/2021);
							(5, 			5, 				06/07/2021);
-- Thêm dữ liệu vào bảng Type Question
INSERT INTO TypeQuestion	(TypeID, 	TypeName)
VALUES
							(1, 'Essay');
							(2, 'Multiple-Choice');
							(3, 'Essay');
							(4, 'Multiple-Choice');
							(5, 'Essay');
-- Thêm dữ liệu vào bảng Category Question
INSERT INTO CategoryQuestion(CategoryID, CategoryName)
VALUES
							(12, 'Category1');
							(13, 'Category2');
							(14, 'Category3');
							(15, 'Category4');
							(16, 'Category5');
-- Thêm dữ liệu vào bảng Question
INSERT INTO Question(QuestionID, Content, CategoryID, TypeID, CreatorID, CreateDate)
VALUES
(1, 'Q1', 12,1, 11, 30/04/2021);
(2, 'Q2', 13,2, 12, 21/05/2021);
(3, 'Q3', 14,3, 13, 22/06/2021);
(4, 'Q4', 15,4, 14, 24/08/2021);
(5, 'Q5', 16,5,15, 25/10/2021);
-- Thêm dữ liệu vào bảng Answer
INSERT INTO Answer(Answer ID, Content, QuestionID, isCorrect)
VALUES
(1, 'A1', 1, 1);
(2, 'A2', 2, 0);
(3, 'A3', 3, 1);
(4, 'A4', 4, 1);
(5, 'A5', 5, 0);
-- Thêm dữ liệu vào bảng Exam
INSERT INTO Exam(ExamID, Code, Title, CategoryID, Duration, CreatorID, CreateDate)
VALUES
(1, 39210, 'Title1', 12, 3600, 11, 10/07/2021);
(2, 12312, 'Title2', 13, 3600, 12, 11/07/2021);
(3, 23443, 'Title3', 14, 3600, 13, 12/07/2021);
(4, 65673, 'Title4', 15, 3600, 14, 20/07/2021);
(5, 74543, 'Title5', 16, 3600, 15, 22/07/2021);
-- Thêm dữ liệu vào bảng Exam Question
INSERT INTO ExamQuestion(ExamID, QuestionID)
VALUES
(01, 1);
(02, 2);
(03, 3);
(04, 4);
(05, 5);