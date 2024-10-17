/* Java
class Person {
    private String name;
    private int age
    }
Person person = new Person("홍길동", 22);
*/
const person = {'name' : '홍길동', 'age' : 22};
// const person = {name : '홍길동', age : 22};  가능
console.log('name : ' + person.name, ', age : ' + person.age);
person.name = '신길동'; // 변경 가능
console.log('name : ' + person.name, ', age : ' + person.age);
console.log('name : ' + person['name'], ', age : ' + person['age']);

/*****************************배열**********************************/
const arr = ['홍길동', 22]; // arr = {0 : '홍길동', 1 : 22};
arr[0] = '신길동';
console.log(arr[0], arr[1]);