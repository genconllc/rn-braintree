import { NativeModules } from 'react-native';

type RnBraintreeType = {
  multiply(a: number, b: number): Promise<number>;
  setupBT(token: string): Promise<string>;
};

const { RnBrainTreeModule } = NativeModules;

export default RnBrainTreeModule as RnBraintreeType;
