//
//  MyViewController.h
//  TemperatureConverter
//
//  Created by Thomas Künneth on 08.11.16.
//  Copyright © 2016 My Company. All rights reserved.
//

#import <UIKit/UIKit.h>

@interface MyViewController : UIViewController
@property (weak, nonatomic) IBOutlet UITextField *input;
@property (weak, nonatomic) IBOutlet UILabel *result;
- (IBAction)calculate:(UIButton *)sender;

@property (weak, nonatomic) IBOutlet UIPickerView *tempSrc;

@property (weak, nonatomic) IBOutlet UIPickerView *tempDesti;

@end
