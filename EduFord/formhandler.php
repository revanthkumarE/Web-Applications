<?php
$name = $_POST['name'];
$visitor_email = $_POST['email']
$subject = $_POST['subject']
$message = $_POST['message']

$email_from = 'revanthkumar20029@gmail.com';
$email_subject = 'New Form Submission';

$email_body = "user name: $name.\n".
               "user email: $visitor_email.\n".
                "subject: $subject.\n".
                 "user message: $message.\n";

$to = 'revanthkumar822@gmail.com';
$headers = "From: $email_from \r\n"; 
$headers .= "Reply-To: $visitor_email \r\n";

mail($to,$email_subject,$email_body,$headers);

header("location: contact.html");



?>