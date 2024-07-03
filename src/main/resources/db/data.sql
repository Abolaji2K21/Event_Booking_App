TRUNCATE TABLE organizer CASCADE;
TRUNCATE TABLE event CASCADE;

INSERT INTO organizer(id, email, username, password, date_registered, date_updated) VALUES
    (200, 'organizer@gmail.com','username', 'password','2024-06-04T15:03:03.792009700', '2024-06-04T15:03:03.792009700'),
    (201, 'organizer001@gmail.com','username001', 'password','2024-06-04T15:03:03.792009700', '2024-06-04T15:03:03.792009700'),
    (202, 'organizer002@gmail.com','username002', 'password','2024-06-04T15:03:03.792009700', '2024-06-04T15:03:03.792009700')



INSERT INTO event(id, event_name,  event_location, date_created, attendees, discription, category, organizer_id) VALUES
(100, 'Summer Picnic', 'Central Park', '2024-06-15', 50, 'Annual company picnic with foods', 'SOCIAL', 200),
(101, 'Marketing Conference', 'Palace', '2024-04-20', 200, 'Two-day conference ', 'CONFERENCE,', 202),
(102, 'Charity ', 'Semi_Colon', '2024-09-10', 300, 'Formal fundraising event ', 'SOCIAL', 201),
(103, 'December party', 'Main_Land', '2024-07-01', 75, 'Party all night', 'CONCERT', 201),
(104, 'Tech Meetup', 'Semi_Colon', '2024-05-05', 100, 'Monthly meetup ', 'PROFESSIONAL', 200);