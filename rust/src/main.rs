// use std::collections::HashSet;

mod solution;

fn main() {
    println!("Hello there!\n");
    let problem1: i32 = (1..1000).filter(|&n| n % 3 == 0 || n % 5 == 0).sum();
    println!("{}", problem1);


    let lazy_list =
        std::iter::successors(Some((0, 1)), |&(a, b)| Some((b, a + b)))
            .map(|(a, _)| a);
    let problem_2 = lazy_list.take_while(|&n| n <= 4000000).filter(|&n| n % 2 == 0).sum::<i32>();
    println!("{}", problem_2);
}

