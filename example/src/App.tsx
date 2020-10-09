import * as React from 'react';
import { StyleSheet, View, Text, Button } from 'react-native';
import RnBraintree from 'rn-braintree';

export default function App() {

  async function onButtonPress() {
    try {
      const res = await RnBraintree.setupBT("check")
      console.log(res, "response")
    } catch (error) {
      console.log(error, "response")
    }
  }

  return (
    <View style={styles.container}>
      <Button
        onPress={onButtonPress}
        title={"SetUp"}
      />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
});
