export class TestNpc {
    id: number;
    name: string;
    money: number;
    
    constructor(values = {}) {
        Object.apply(this, values);
    }
}
