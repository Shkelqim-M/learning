// use std::collections::HashSet;

mod solution;

fn main() {
    println!("Hello there!\n");
    let problem_1: i32 = (1..1000).filter(|&n| n % 3 == 0 || n % 5 == 0).sum();
    println!("{}", problem_1);


    let lazy_list =
        std::iter::successors(Some((0, 1)), |&(a, b)| Some((b, a + b)))
            .map(|(a, _)| a);
    let problem_2 = lazy_list.take_while(|&n| n <= 4000000).filter(|&n| n % 2 == 0).sum::<i32>();
    println!("{}", problem_2);

    fn factors(n: u64) -> Vec<u64> {
        match (2..=(n as f64).sqrt() as u64).find(|&i| n % i == 0) {
            Some(i) => {
                let mut result = factors(n / i);
                result.push(i);
                result
            }
            None => vec![n],
        }
    }
    let problem_3 = factors(600851475143);
    println!("{:?}", problem_3.first());

    let problem_4 =
        (100..=999)
            .flat_map(|i| (i..=999).map(move |j| i * j))
            .filter(|n| n.to_string() == n.to_string().chars().rev().collect::<String>())
            .max()
            .unwrap_or(0);

    println!("{}", problem_4);

    // let problem_5 = (20..).find(|&n| (2..=20).all(|m| n % m == 0)).unwrap();
    // println!("{}", problem_5); // It's not performant!!!

    let square = |n: i32| n * n;
    let problem_6 = square((1..=100).sum::<i32>()) - (1..=100).map(square).sum::<i32>();
    println!("{}", problem_6);
}

