import { requireNativeComponent, ViewStyle } from 'react-native';

type RnjwplayerProps = {
  color: string;
  style: ViewStyle;
};

export const RnjwplayerViewManager =
  requireNativeComponent<RnjwplayerProps>('RnjwplayerView');

export default RnjwplayerViewManager;
