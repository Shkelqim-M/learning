/*
pub fn can_construct(ransom_note: String, magazine: String) -> bool {
    ransom_note.chars().filter(|&c| magazine.contains(c)).count() == ransom_note.chars().count()
}

pub fn longest_palindrome(s: String) -> String {
    let chars: Vec<char> = s.chars().collect();
    let n = chars.len();
    let mut dp = vec![vec![false; n]; n];
    let mut longest = String::new();

    for i in (0..n).rev() {
        for j in i..n {
            dp[i][j] = (chars[i] == chars[j]) && (j - i < 3 || dp[i + 1][j - 1]);
            if dp[i][j] && (j - i + 1) > longest.len() {
                longest = s[i..=j].to_string();
            }
        }
    }
    longest
}

pub fn running_sum(nums: Vec<i32>) -> Vec<i32> {
    let mut sum = 0;
    nums.into_iter()
        .map(|x| {
            sum += x;
            sum
        })
        .collect::<Vec<i32>>()
}

pub fn pivot_index(nums: Vec<i32>) -> i32 {
    let sum: i32 = nums.iter().sum();
    let mut left = 0;
    for i in 0..nums.len() {
        if left == sum - left - nums[i] {
            return i as _;
        }
        left += nums[i]
    }
    -1
}

pub fn search_insert(nums: Vec<i32>, target: i32) -> i32 {
    nums.binary_search(&target).unwrap_or_else(|x| x) as i32
}

pub fn length_of_last_word(s: String) -> i32 {
    match s.trim().split(" ").last() {
        Some(word) => word.len() as i32,
        None => 0,
    }
}

pub fn str_str(haystack: String, needle: String) -> i32 {
    return match haystack.find(&needle) {
        Some(t) => t as i32,
        None => -1,
    };
}

pub fn remove_duplicates(nums: &mut Vec<i32>) -> i32 {
    match nums.is_empty() {
        true => 0,
        false => {
            let mut prev = 0;
            for i in 1..nums.len() {
                if nums[prev] != nums[i] {
                    prev += 1;
                    nums[prev] = nums[i];
                }
            }
            (prev + 1) as i32
        }
    }
}*/