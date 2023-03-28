// use std::collections::HashSet;

mod solution;

fn main() {
    println!("Hello there!\n");
    println!("Longest Palindrome: {}", solution::longest_palindrome(String::from("babad")));


    // println!("{}", solution::length_of_last_word("Hello world".to_string()));
    // println!("{}", solution::search_insert([1, 3, 5, 6].to_vec(), 5));
    // println!("{}", solution::pivot_index([1, 7, 3, 6, 5, 6].to_vec()));
    // println!("{:?}", solution::running_sum([1, 2, 3, 4].to_vec()));
}